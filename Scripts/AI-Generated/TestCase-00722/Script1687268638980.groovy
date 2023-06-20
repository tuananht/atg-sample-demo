import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_getting-project-path-at-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/getting-project-path-at-runtime/24349/3')

'step 2: Add visual checkpoint at Page_t_getting-project-path-at-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00722_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
