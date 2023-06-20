import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_files-are-not-download-to-the-folder-set-by-desired-capability-setting-in-jenkins-linux'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/files-are-not-download-to-the-folder-set-by-desired-capability-setting-in-jenkins-linux/43707')

'step 2: Add visual checkpoint at Page_t_files-are-not-download-to-the-folder-set-by-desired-capability-setting-in-jenkins-linux'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00870_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
