import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_using-variable-in-objects-properties'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/using-variable-in-objects-properties/11335')

'step 2: At Page_t_using-variable-in-objects-properties click on p_object'

testObj = findTestObject('Object Repository/Page_t_using-variable-in-objects-properties/p_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/using-variable-in-objects-properties/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_using-variable-in-objects-properties'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00016_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
