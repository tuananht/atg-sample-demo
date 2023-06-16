import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_excluding-specific-classes-out-of-the-plugin-jar'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/excluding-specific-classes-out-of-the-plugin-jar/21049')

'step 2: At Page_t_excluding-specific-classes-out-of-the-plugin-jar click on code_object --> navigate to Page_t_excluding-specific-classes-out-of-the-plugin-2'

testObj = findTestObject('Object Repository/Page_t_excluding-specific-classes-out-of-the-plugin-jar/code_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/excluding-specific-classes-out-of-the-plugin-jar/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_excluding-specific-classes-out-of-the-plugin-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00003_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
