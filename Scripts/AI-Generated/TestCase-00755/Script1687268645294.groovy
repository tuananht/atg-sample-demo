import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-print-the-json-pretty-response-and-also-save-as-22'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-print-the-json-pretty-response-and-also-save-as-json/39335/22')

'step 2: Add visual checkpoint at Page_t_how-to-print-the-json-pretty-response-and-also-save-as-22'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00755_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
