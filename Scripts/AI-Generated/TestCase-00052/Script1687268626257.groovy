import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-automation-recorder-how-to-do-a-file-upload-htmlinputelement'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-automation-recorder-how-to-do-a-file-upload-htmlinputelement/9012')

'step 2: At Page_t_katalon-automation-recorder-how-to-do-a-file-upload-htmlinputelement click on div_object --> navigate to Page_t_katalon-automation-recorder-how-to-do-a-file-upload-35'

testObj = findTestObject('Object Repository/Page_t_katalon-automation-recorder-how-to-do-a-file-upload-htmlinputelement/div_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/katalon-automation-recorder-how-to-do-a-file-upload-htmlinputelement/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_katalon-automation-recorder-how-to-do-a-file-upload-35'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00052_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
