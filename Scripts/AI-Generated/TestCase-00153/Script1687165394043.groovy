import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_loading-project-and-katalon-studio-is-stuck-at-generating-global-variables'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/loading-project-and-katalon-studio-is-stuck-at-generating-global-variables/18669')

'step 2: Add visual checkpoint at Page_t_loading-project-and-katalon-studio-is-stuck-at-generating-global-variables'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00153_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
