import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-there-any-tool-in-katalon-to-execute-the-scripts-without-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-there-any-tool-in-katalon-to-execute-the-scripts-without-katalon-studio/44121')

'step 2: Add visual checkpoint at Page_t_is-there-any-tool-in-katalon-to-execute-the-scripts-without-katalon-studio'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00667_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
