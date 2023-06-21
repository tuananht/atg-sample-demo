import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-convert-xml-file-to-json-file-using-groovy'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-convert-xml-file-to-json-file-using-groovy/46726')

'step 2: At Page_t_how-to-convert-xml-file-to-json-file-using-groovy click on div_object --> navigate to Page_t_how-to-convert-xml-file-to-json-file-using-2'

testObj = findTestObject('Object Repository/Page_t_how-to-convert-xml-file-to-json-file-using-groovy/div_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-convert-xml-file-to-json-file-using-groovy/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_how-to-convert-xml-file-to-json-file-using-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00003_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
