import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_downloading-files-not-working-anymore-in-chrome-headless-mode'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/downloading-files-not-working-anymore-in-chrome-headless-mode/85042')

'step 2: Add visual checkpoint at Page_t_downloading-files-not-working-anymore-in-chrome-headless-mode'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00783_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
